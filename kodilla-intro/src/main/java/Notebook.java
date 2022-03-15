public class Notebook {
    int weight;
    int price;
    int year;
        public Notebook(int weight, int price, int year) {
            this.weight = weight;
            this.price = price;
            this.year = year;
        }
        public void checkPrice(){
            if (this.price < 600){
                System.out.println("This notebook is very cheap");
            } else if (this.price > 600 && this.price <= 1000){
                System.out.println("The price is good");
            } else if (this.price > 1000){
                System.out.println("This notebook is expensive");
            }
        }
        public void checkWeight(){
            if (this.weight < 700){
                System.out.println("This notebook is light");
            } else if (this.weight > 700 && this.price <= 2000){
                System.out.println("This notebook is not very heavy");
            } else if (this.weight > 2000){
                System.out.println("This notebook is very heavy");
            }
        }
        public void checkWeightAndPrice(){
            if (this.price < 900 && this.year < 2015){
                System.out.println("This is cheap and old notebook");
            } else if (this.price >= 900 && this.price < 1400 && this.year >=2015 && this.year < 2019){
                System.out.println("This is mid-range notebook");
            } else if (this.price >=1400 && this.year >=2019){
                System.out.println("This is expensive and new notebook");
            }
        }
    }
