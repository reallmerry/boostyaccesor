public class redLanCeMIneCrAft {
   public final boolean toast;
   public final boolean success;
   public final boolean retry;
   public final String msg;
   public final boolean shelf;

   public redLanCeMIneCrAft(Throwable var1) {
      this.msg = var1.getLocalizedMessage() == null ? var1.getMessage() : var1.getLocalizedMessage();
      this.toast = false;
      this.retry = true;
      this.success = false;
      this.shelf = true;
   }
}
