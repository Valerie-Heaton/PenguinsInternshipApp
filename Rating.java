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
    * This is a constructor method for the Rating class that will return the rating of the user.
    * @param rater is the appropriate User and is assigned to this.rater.
    * @param rating is the appropriate Int and is assigned to this.rating.
    * @param comment is the appropriate String and is assigned to this.comment.
    */
   public Rating(User rater, int rating, String comment) {
      this.rater = rater;
      this.rating = rating;
      this.comment = comment;
   }

  /**
   * This method fetches the rater.
   * @return returns the rater variable.
   */
   public User getRater() {
      return this.rater;
   }

  /**
   * This method fetches the rating.
   * @return returns the rating variable.
   */
   public int getRating() {
      return this.rating;
   }

  /**
   * This method fetches the comment of the user.
   * @return returns the comment variable.
   */
   public String getComment() {
      return this.comment;
   }

}