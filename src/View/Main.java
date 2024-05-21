package View;

import Model.Lista;
import Control.hashFunc;

import static java.lang.String.valueOf;

public class Main {
    public void main(String[] args) throws Exception {
        String[] phoneNumbers = {
                "11234567890",
                "21987654321",
                "31912345678",
                "41987654321",
                "51912345678"
        };

        int start = 11;
        int end = 99;
        int size = end - start + 1;

        String[] telefoneArray = new String[size];
        for (String phoneNumber : phoneNumbers) {
            int index = hashFunc.hash(phoneNumber, start, end);
            telefoneArray[index - start] = phoneNumber;
            System.out.println("Número " + phoneNumber + " foi mapeado para a posição " + index);
        }

        for (int i = 0; i < size; i++) {
            int index = i + start;
            System.out.println("Posição " + index + ": " + telefoneArray[i]);
        }


    }

}
