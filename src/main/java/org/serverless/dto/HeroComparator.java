package org.serverless.dto;

import java.util.Comparator;

public class HeroComparator implements Comparator<HeroDTO> {
    public int compare(HeroDTO s1, HeroDTO s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
