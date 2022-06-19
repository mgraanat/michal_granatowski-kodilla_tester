package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class AlertServiceTestSuite {

    AlertService alertService = new AlertService();
    Subscriber subscriber = Mockito.mock(Subscriber.class);
    Localization localization = Mockito.mock(Localization.class);
    Alert alert = Mockito.mock(Alert.class);

    Subscriber firstSubscriber = Mockito.mock(Subscriber.class);
    Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
    Localization firstLocalization = Mockito.mock(Localization.class);
    Localization secondLocalization = Mockito.mock(Localization.class);

    @Test
    public void subscriberShouldReceiveAlert() {
        //given
        alertService.addSubscriberToLocalization(localization, subscriber);
        //when
        alertService.sendAlertToAllSubscriber(alert);
        //then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void alertShouldBeSendToAllSubscribers() {
        //given
        alertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        alertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        alertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        //when
        alertService.sendAlertToAllSubscriber(alert);
        //then
        Mockito.verify(firstSubscriber, Mockito.times(2)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void alertShouldBeSendToSubscribersInGivenLocalization() {
        //given
        alertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        alertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        alertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        //when
        alertService.sendAlertToSubscribersInGivenLocalization(firstLocalization, alert);
        //then
        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void unsubscribedShouldNotReceiveAlert() {
        //given
        alertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        alertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        alertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        //when
        alertService.removeSubscriber(firstSubscriber);
        alertService.sendAlertToAllSubscriber(alert);
        //then
        Mockito.verify(firstSubscriber, Mockito.never()).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void whenLocalizationCancelledSubscribersNotReceiveAlert() {
        //given
        alertService.addSubscriberToLocalization(firstLocalization, firstSubscriber);
        alertService.addSubscriberToLocalization(firstLocalization, secondSubscriber);
        alertService.addSubscriberToLocalization(secondLocalization, firstSubscriber);
        //when
        alertService.cancelLocalization(secondLocalization);
        alertService.sendAlertToAllSubscriber(alert);
        //then
        Mockito.verify(firstSubscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

}