            public class Main {
            public static void main(String[] args) {
                String secret = "this_is_my_secret";
                String name = "Max";
                int year = 1982;

                String cipheredSecret = cipherSecret(secret, name, year);
                System.out.println(cipheredSecret);
            }

            public static String cipherSecret(String secret, String name, int year) {

                // Concatenate the love secret with the love name
                String concatenatedString = secret + name;

                // Reverse the string
                String reversedString = new StringBuilder(concatenatedString).reverse().toString();

                // Concatenate the reversed string with the year of birth
                String cipheredSecret = reversedString + year;

                return cipheredSecret;
            }
        }
