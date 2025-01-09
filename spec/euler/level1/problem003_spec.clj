(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

          (it "Solves #3"
              (should= 5 (euler-3 1000)))
          (it "can check if prime"
          (should= true (is-prime 7)))
          (it "can check if not prime"
          (should= false (is-prime 10)))
          (it "can check if factor"
              (should= true (is-factor 10 5)))
          (it "can check if not factor"
              (should= false (is-factor 10 6)))
          (it "can find factors"
              (should= '(2 5) (find-prime-factors 10)))
          (it "can find prime factors"
              (should= '(2 5) (find-prime-factors 50)))
          )

(run-specs)
