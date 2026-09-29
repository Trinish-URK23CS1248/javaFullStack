package oops_inheritance;
import java.util.ArrayList;
public class VideoStore {
    private ArrayList<Video> store;
    public VideoStore() {
        store = new ArrayList<>();
    }
    public void addVideo(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                System.out.println("Video already exists.");
                return;
            }
        }
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }
    public void doCheckout(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                if (v.getCheckout()) {
                    System.out.println("Video is already checked out.");
                } else {
                    v.doCheckout();
                    System.out.println("Video \"" + name + "\" checked out successfully.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }
    public void doReturn(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                if (!v.getCheckout()) {
                    System.out.println("Video is already available.");
                } else {
                    v.doReturn();
                    System.out.println("Video \"" + name + "\" returned successfully.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }
    public void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video not found.");
    }
    public void listInventory() {
        if (store.isEmpty()) {
            System.out.println("No videos available.");
            return;
        }
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-20s %-18s %-10s\n", "Video Name", "Checkout Status", "Rating");
        System.out.println("---------------------------------------------------------");
        for (Video v : store) {
            System.out.printf("%-20s %-18s %-10d\n",
                    v.getName(),
                    v.getCheckout(),
                    v.getRating());
        }
        System.out.println("---------------------------------------------------------");
    }
}