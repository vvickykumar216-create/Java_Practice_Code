package Non_Parameterized_Constructor;

public class SecurityCamera {

    boolean isRecording;

    // No-Argument
    SecurityCamera() {
        isRecording = false;
    }

    public static void main(String[] args) {

        SecurityCamera camera = new SecurityCamera();

        System.out.println("Recording: " + camera.isRecording);
    }
}
