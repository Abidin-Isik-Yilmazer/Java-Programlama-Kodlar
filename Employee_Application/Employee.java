public class Employee {
    public String name;
    public double salary;
    public double workHours;
    public int hireYear;

    Employee(int hireYear,double workHours,double salary,String name){
        this.hireYear=hireYear;
        this.workHours=workHours;
        this.salary=salary;
        this.name=name;
    }

    private double tax(){
        if(this.salary>1000){
            return (this.salary*0.03);
        }
        else{
            return 0.0;
        }
    }

    private double bonusMethod(){
        double extraWorkHours=this.workHours-40;
        if(extraWorkHours>0){
            return extraWorkHours*30;
        }
        else{
            return 0.0;
        }
    }

    private double increaseSalary(){
        int extraYear=2026-this.hireYear;
        if(extraYear<10){
            return this.salary*0.05;
        }
        else if(extraYear>=10 && extraYear<20){
            return this.salary*0.1;
        }
        else{
            return this.salary*0.15;
        }
    }

    public void output(){
        System.out.println("Name: "+this.name);
        System.out.println("Tax: "+this.tax());
        System.out.println("Bonus: "+this.bonusMethod());
        System.out.println("Increase Salary: "+this.increaseSalary());
        double totalSalaryTB=(this.salary-this.tax())+this.bonusMethod();
        System.out.println("Total Salary with tax and bonus: "+totalSalaryTB);
        double totalSalaryI=this.salary+this.increaseSalary();
        System.out.println("Total salary including increase: "+totalSalaryI);
        double totalSalary=this.salary+this.bonusMethod()+this.increaseSalary()-this.tax();
        System.out.println("Total salary: "+totalSalary);
    }
}
