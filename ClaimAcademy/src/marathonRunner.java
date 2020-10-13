public class marathonRunner {

    public static void main (String[] args){

        //calculating time
        int time = 7724;
        int hours = time/3600;
        time -= hours * 3600;
        int minutes = time/60;
        time -= minutes * 60;
        int seconds = time;

        //calculating pace

        //I could cast it to a double, but I'll just rewrite to save time;

        double p_time= 7724 / 60;
        double pace = p_time / 26.2;



        System.out.println(hours+"hrs:"+minutes+"mins:"+seconds+"secs");

        //converting it to a string so we can adjust the decimal places

        String _pace = String.format("%.3f", pace);
        System.out.print("Average pace: "+_pace+" minutes per mile");

    }

}
