public class Main {
    public static void main(String[] args) {
        System.out.println(radHealth(26, -5));
        System.out.println(radHealth(89, 30));
        System.out.println(radHealth(16, 19));
        System.out.println(radHealth(66, -12));
        System.out.println(radHealth(26, 29));

    }

    public static String radHealth(int let, int temperatur) {
        if ((let > 20) && (let < 45) && (temperatur > -20) && (temperatur < 30)) {
            return "Можно идти гулять";
        } else if ((let < 20) && (temperatur > 0) && (temperatur < 28)) {
            return "Можно идти гудять";
        } else if ((let > 45) && (temperatur > -10) && (temperatur < 25)) {
            return "Можно идти гулять";
        } else {
            return "Нельзя гулять сиди дома";
        }
    }
    

}