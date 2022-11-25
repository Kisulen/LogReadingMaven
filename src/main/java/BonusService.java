public class BonusService {

  public long calculate(long amount, boolean registered) {
       long bonus = amount * (registered ? 3 : 1) / 100;
    long limit = 500;
    if (bonus > limit) {
      bonus = limit;
    }
    return bonus;
  }
}


