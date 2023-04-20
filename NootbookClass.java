import java.util.*;

public class NootbookClass {
    private int id;
    private String CPU_num;
    private String hdd;
    private String ram;
    private String os_type;
    private String color;
    private String brand;


    public NootbookClass(int id, String CPU_num, String hdd, String ram, String os_type, String color, String brand) {
        this.id = id;
        this.CPU_num = CPU_num;
        this.hdd = hdd;
        this.ram = ram;
        this.os_type = os_type;
        this.color = color;
        this.brand = brand;
    }



    public int getId() {
        return id;
    }


    public String getCPU_num() {
        return CPU_num;
    }


    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public String getOs_type() {
        return os_type;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCPU_num(String CPU_num) {
        this.CPU_num = CPU_num;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setOs_type(String os_type) {
        this.os_type = os_type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "NootbookClass{" +
                "id=" + id +
                ", CPU_num=" + CPU_num +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", os_type='" + os_type + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}'+ "\n";
    }

    private static HashMap<String, String> userRequest() {
        HashMap<String, String> userRequest = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметры для поиска. Параметры, которые не участвуют в поиске,оставьте пустыми:");
        System.out.print("Введите бренд:");
        userRequest.put("1", scanner.nextLine());
        System.out.print("Введите объем оперативной памяти:");
        userRequest.put("2", scanner.nextLine());
        System.out.print("Введите объем жесткого диска:");
        userRequest.put("3", scanner.nextLine());
        System.out.print("Введите цвет корпуса:");
        userRequest.put("4", scanner.nextLine());
        scanner.close();
        return userRequest;
    }

    public static void Filter(Set<NootbookClass> notebooks) {

        Set<NootbookClass> temp = new HashSet<>(notebooks);
        Map<String, String> criterias = userRequest();

        for (NootbookClass notebook : notebooks) {
            for (Object parameters : criterias.keySet()) {
                if (!criterias.get(parameters).equals("")) {
                    if ((String) parameters == "1" && !criterias.get(parameters).equals(notebook.getBrand())) {
                        temp.remove(notebook);
                    } else if ((String) parameters == "2" && !criterias.get(parameters).equals(notebook.getRam())) {
                        temp.remove(notebook);
                    } else if ((String) parameters == "3" && !criterias.get(parameters).equals(notebook.getHdd())) {
                        temp.remove(notebook);
                    } else if ((String) parameters == "4" && !criterias.get(parameters).equals(notebook.getColor())) {
                        temp.remove(notebook);
                    }
                }
            }
        }
        if (temp.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
        } else {
            System.out.println("Вот что мы можем предложить: \n" + temp.toString());
        }
    }
}