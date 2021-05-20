import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
public class SILab2 {
    public static List<Integer> function(List<Time> timesList) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0/*A*/; i < timesList.size()/*B*/; i++/*P*/) {
            int hr = timesList.get(i).getHours();//C
            int min = timesList.get(i).getMinutes();//C
            int sec = timesList.get(i).getSeconds();//C
            if (hr < 0 || hr > 24){//C
                if (hr < 0){//D
                    throw new RuntimeException("The hours are smaller than the minimum");//E
                }
                else {//F
                    throw new RuntimeException("The hours are grater than the maximum");//F
                }
            }
            else if (hr < 24) {//G
                if (min < 0 || min > 59)//H
                    throw new RuntimeException("The minutes are not valid!");//I
                else {//J
                    if (sec >= 0 && sec <= 59)//J
                        result.add(hr * 3600 + min * 60 + sec);//r.add
                    else//K
                        throw new RuntimeException("The seconds are not valid");//K
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) {//L
                result.add(hr * 3600 + min * 60 + sec);//r.add
            }
            else {//M
                throw new RuntimeException("The time is greater than the maximum");//M
            }
        }
        return result; //N
    }
}
