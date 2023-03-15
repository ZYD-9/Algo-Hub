import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TravellingSpaceTime {
    public static int booleanSwitch(String[] message) {
        int sendback = 0;
        boolean switchBool = false;

        for (String no : message) {
            if (no.equals("0") && !switchBool) {
                switchBool = !switchBool;
                sendback++;
            }

            if (no.equals("1") && switchBool) {
                switchBool = !switchBool;
                sendback++;
            }
        }

        return sendback;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(reader.readLine());
        String r = "";

        for (int i = 0; i < testCases; i++) {
            int starSystems = Integer.parseInt(reader.readLine());
            String[] message = reader.readLine().split("");
            if (message.length > starSystems) break;

            r += booleanSwitch(message) + ",";
        }

        String[] counts = r.split(",");

        for (String count : counts) {
            System.out.println(count);
        }
    
    }
}
