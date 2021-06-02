class Company{
    private String name;

    void setName(String n){
        name=n;
    }

    class Employee{// class didalam class
        String name;
        //KEUNTUNGAN MENGGUNAKAN INNER CLASS ADALAH:
        //MENGAKSES OUTER CLASS
        String getNameCompany(){
            return Company.this.name; //mengakses field private class company
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Company obj = new Company();
        obj.setName("name obj");
        Company.Employee karyawan = obj.new Employee();
        System.out.println(karyawan.getNameCompany());;
    }
}
