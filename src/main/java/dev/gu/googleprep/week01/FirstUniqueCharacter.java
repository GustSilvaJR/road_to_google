package dev.gu.googleprep.week01;

import java.util.OptionalInt;

/** Semana 01: encontre o primeiro ponto de código Unicode não repetido. */
public final class FirstUniqueCharacter {
    private FirstUniqueCharacter() { }

    public static OptionalInt firstUniqueCodePoint(String text) {

        int foundEqual = 0;
        for (int i=0; i < text.length(); i++){
            for(int j=0; j < text.length(); j++){
                if(i != j && text.charAt(i) == text.charAt(j)){
                    foundEqual = 1;
                }
            }
            if(foundEqual == 0){
                System.out.println(text.charAt(i));
                return OptionalInt.of(text.codePointAt(i));
            }else{
                foundEqual = 0;
            }
        }

        return null;
    }
}
