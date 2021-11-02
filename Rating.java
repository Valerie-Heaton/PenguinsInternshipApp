/**
 * This is the driver we will use to show the rating of the user.
 * 
 * @author Siri, Maddie, Valerie, Ali
 */

public class Rating {
   private User rater;
   private int rating;
   private String comment;
   
   /**
    * this method will return the rating of the user 
    */
   public Rating(User rater, int rating, String comment) {
      this.rater = rater;
      this.rating = rating;
      this.comment = comment;
   }

   /**
   *this method will get the rater
   */
   public User getRater() {
      return this.rater;
   }
   
   public int getRating() {
      return this.rating;
   }

   /**
   * this method will get the comment of the user
   */
   public String getComment() {
      return this.comment;
   }

}