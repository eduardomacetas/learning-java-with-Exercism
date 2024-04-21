// Exercise: https://exercism.org/tracks/java/exercises/armstrong-numbers

class ArmstrongNumbers {

  boolean isArmstrongNumber(int numberToCheck) {

      int total = 0;
      
      String numeroComoString = Integer.toString(numberToCheck);
      int cantidadDigitos = numeroComoString.length();
      
      String numString = String.valueOf(numberToCheck);
      for (char digitChar : numString.toCharArray()) {
          if(Character.isDigit(digitChar)) {
              int digit = Character.getNumericValue(digitChar);
              total += Math.pow(digit,cantidadDigitos);
          }
      }

      if(total == numberToCheck) {
          return true;
      } else {
          return false;
      }

  }

}
