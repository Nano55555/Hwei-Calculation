public class calculation{
    public static void main(String[] args) {
        int level = Integer.parseInt(args[0]);
        double AP = Double.parseDouble(args[1]);
        double MaxHP = Double.parseDouble(args[2]);

        double currentHP = 100;
        while (currentHP > 0) {
            if (QQ(level, AP, MaxHP) >= QW(level, AP, currentHP)) {
                System.out.println(currentHP + ": QQ");
            }
            else {
                System.out.println(currentHP + ": QW");
            }
            currentHP -= 10;
        }
    }
    public static double QQ(int level, double AP, double MaxHP){
        switch(level){
            case 1:
            return 60 + AP * 0.75 + MaxHP * 0.04;
            case 2:
            return 90 + AP * 0.75 + MaxHP * 0.05;
            case 3:
            return 120 + AP * 0.75 + MaxHP * 0.06;
            case 4:
            return 150 + AP * 0.75 + MaxHP * 0.07;
            case 5:
            return 180 + AP * 0.75 + MaxHP * 0.08;
            default:
            return 0;
        }
    }

    public static double QW(int level, double AP, double currentHPpercent){
        switch(level){
            case 1:
            return (80 + AP * 0.25) * ((100-currentHPpercent) * 2/100) + (80 + AP * 0.25);
            case 2:
            return (100 + AP * 0.25) * ((100-currentHPpercent) * 2.375/100) + (80 + AP * 0.25);
            case 3:
            return (120 + AP * 0.25) * ((100-currentHPpercent) * 2.75/100) + (80 + AP * 0.25);
            case 4:
            return (140 + AP * 0.25) * ((100-currentHPpercent) * 3.125 /100) + (80 + AP * 0.25);
            case 5:
            return (160 + AP * 0.25) * ((100-currentHPpercent) * 3.5/100) + (80 + AP * 0.25);
            default:
            return 0;
    }
}
}