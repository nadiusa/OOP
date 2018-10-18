package com.company;

public class Phone {
         int area;   // area code (3 digits)
         int exch;   // exchange  (3 digits)
         int ext;
    String phoneNumber;// extension (4 digits)

        public Phone(int area, int exch, int ext) {
            this.area = area;
            this.exch = exch;
            this.ext  = ext;
            String area1 = String.valueOf(area);
            String exch1 = String.valueOf(exch);
            String ext1 = String.valueOf(ext);
            phoneNumber= area1+ "" + exch1 +""+ ext1;
        }
        public String getPhone(){
            return phoneNumber;
        }
}

