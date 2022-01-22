public class Encryption {

    private String mInputString;
    private int mShift;
    //    gettters

    public String getmInputString(){
        return mInputString;
    }

    public int getmShift(){
        return mShift;
    }

    //constructors
    public Encryption(String mInputString, int mShift) {
        this.mInputString = mInputString;
        this.mShift = mShift;
    }
    public static String encrypt(Encryption encrypt){

        if(encrypt.mShift > 26){
            encrypt.mShift = encrypt.mShift % 26;
        }
        else if(encrypt.mShift < 0) {
            encrypt.mShift = (encrypt.mShift % 26) + 26;
        }

        String outputString = "";
        int length = encrypt.mInputString.length();
        for (int i = 0; i < length ; i++) {
            char cc = encrypt.mInputString.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char)(cc+encrypt.mShift);
                    if(c>'z'){
                        outputString += (char)(cc - (26-encrypt.mShift));
                    }
                    else {
                        outputString += c;
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc+encrypt.mShift);
                    if(c>'Z'){
                        outputString += (char)(cc - (26-encrypt.mShift));
                    }
                    else {
                        outputString += c;
                    }
                }
            }
            else{
                outputString += cc;
            }
        }
        return outputString;
    }

}

