package com.evangertis;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
//1. The Accessible interface? package-private
//2. The int variable SOME_CONSTANT?
//3. methodA?
//4. methodB and methodC?
//
//Hint: think back to the lecture on interfaces before answering

interface Accessible {
    int SOME_CONSTANT = 100; // package-public
    public void methodA(); // package-public
    void methodB(); // package-public
    boolean methodC(); // package-public
}
