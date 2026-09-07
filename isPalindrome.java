// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Solution {
   Solution() {
   }
   public boolean isPalindrome(int var1) {
      if (var1 >= 0 && (var1 % 10 != 0 || var1 == 0)) {
         int var2;
         for(var2 = 0; var1 > var2; var1 /= 10) {
            var2 = var2 * 10 + var1 % 10;
         }
         return var1 == var2 || var1 == var2 / 10;
      } else {
         return false;
      }
   }
}