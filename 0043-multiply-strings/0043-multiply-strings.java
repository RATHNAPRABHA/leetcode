class Solution {
    public String multiply(String num1, String num2) {
      /*  char[] n=num1.toCharArray();
        char[] m=num2.toCharArray();
        int s=1,e=0;
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<m.length-1;j++){
                s=(int)n[i]*(int)m[j];
                e+=s;
            }
        }
        int g=e;
        return String.valueOf(g);
        long n=Long.parseLong(num1);
        long m=Long.parseLong(num2);
        long re=Math.abs(m*n);
        String  mm=String.valueOf(re);
        return mm;*/
        

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();

      
        int[] result = new int[len1 + len2];

        
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
              
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;
                int sum = product + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : result) {
            if (!(sb.length() == 0 && i == 0)) {
                sb.append(i);
            }
        }

        return sb.toString();
    }
}

       
