public class ConeShop {

    public Review[] allReviews;
    public static void main(String[] args) {
        //TODO: Make an instance of the main class
    ConeShop creamery = new ConeShop();
    }

    public ConeShop(){
        //TODO: Give the array allReviews a size of 10
        allReviews = new Review[10];

        //TODO: Fill the array allReviews with reviews with random ratings from 0 to 10 inclusive
        for(int i=0; i< allReviews.length; i++) {
            allReviews[i] = new Review ((int)(Math.random() * 11);
        }
        //TODO: print all the ratings in the array allReviews
        for (int i=0; i< allReviews.length; i++){
            System.out.println(allReviews[i].rating);
        }
        
        //TODO: Call the method averageRating
        averageRating();

    }

    public void averageRating(){
        //TODO: calculate the average rating from the array allReviews and print it
        int num = 0;
        for(int i=0; i< allReviews.length; i++) {
        }
        double average = (double) num / allReviews.length;
        System.out.println(average);
        }

    }

