class employee
{
 String ename="";
 int eid;
 double esal;
 public void ebonus()
 {
  System.out.println("emp bonus is: "+(esal*0.2));
 }
}
public class emp_main
{
 public static void main(String args[])
 {
  employee b1=new employee();
  b1.ename="Srivani";
  b1.eid=441;
  b1.esal=7000;
 
  b1.ebonus();
 }
}
