import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Image extends JFrame {
private ImageIcon image1;
private JLabel label1;
private ImageIcon image2;
private JLabel label2;
private ImageIcon image3;
private JLabel label3;
Image(){
setLayout(new FlowLayout());
image1 = new ImageIcon(getClass().getResource("cat.jpg"));
label1 = new JLabel(image1);
add(label1);
image2 = new ImageIcon(getClass().getResource("cat3.jpg"));
label2 = new JLabel(image2);
add(label2);
image3 = new ImageIcon(getClass().getResource("cat1.jpg"));
label3 = new JLabel(image3);
add(label3);
}
public static void main(String args[]) {
Image gui = new Image();
gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
gui.setVisible(true);
gui.pack();
gui.setTitle("Image Program");
}
}




// import java.awt.FlowLayout;
// import javax.swing.ImageIcon;
// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class Image extends JFrame {
//     private JLabel label1;
//     private JLabel label2;
//     private JLabel label3;
//     private static final int FRAME_WIDTH = 550;
//     private static final int FRAME_HEIGHT = 300;
//     Image() {
//         setLayout(new FlowLayout());
//         ImageIcon image1 = resizeImage("cat.jpg", FRAME_WIDTH / 3, FRAME_HEIGHT);
//         label1 = new JLabel(image1);
//         add(label1);

//         ImageIcon image2 = resizeImage("cat3.jpg", FRAME_WIDTH / 3, FRAME_HEIGHT);
//         label2 = new JLabel(image2);
//         add(label2);

//         ImageIcon image3 = resizeImage("cat1.jpg", FRAME_WIDTH / 3, FRAME_HEIGHT);
//         label3 = new JLabel(image3);
//         add(label3);
//     }
//     private ImageIcon resizeImage(String imagePath, int width, int height) {
//         ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
//         java.awt.Image image = imageIcon.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
//         return new ImageIcon(image);
//     }
//     public static void main(String args[]) {
//         Image gui = new Image();
//         gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         gui.setVisible(true);
//         gui.setSize(FRAME_WIDTH, FRAME_HEIGHT);
//         gui.setTitle("Image Program");
//     }
// }

