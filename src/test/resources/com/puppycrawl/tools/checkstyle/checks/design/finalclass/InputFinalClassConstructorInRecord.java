/*
FinalClass


*/

// Java17
package com.puppycrawl.tools.checkstyle.checks.design.finalclass;

public record InputFinalClassConstructorInRecord(String string) {

    public InputFinalClassConstructorInRecord {
    }
    public InputFinalClassConstructorInRecord(int x) {
        this(String.valueOf(x));
    }

    class F {
        private F() {
        }
    }

    class K extends F {
    }

    class X {
        class F { // violation 'Class F should be declared as final'
            private F() {
            }
        }
    }

}
