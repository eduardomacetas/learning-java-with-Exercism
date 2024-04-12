public class SalaryCalculator {
  double penaltySkippedDays = 0.15;
  public double salaryMultiplier(int daysSkipped) {
      return daysSkipped < 5 ? 1.0 : 1.0-penaltySkippedDays;
  }

  public int bonusMultiplier(int productsSold) {
      return productsSold < 20 ? 10 : 13;
  }

  public double bonusForProductsSold(int productsSold) {
      return (double)productsSold * bonusMultiplier(productsSold);
  }

  public double finalSalary(int daysSkipped, int productsSold) {
      double salary = 1000.0 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
      return salary < 2000.0 ? salary : 2000.0;
  } 
}
