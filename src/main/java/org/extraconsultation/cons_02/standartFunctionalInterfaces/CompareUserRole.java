package org.extraconsultation.cons_02.standartFunctionalInterfaces;

import java.util.function.Predicate;

public class CompareUserRole implements Predicate<UserRole> {
    @Override
    public boolean test(UserRole userRole) {
        return userRole.getRole().equals("admin");
    }
}
