(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

          (it "Solves #4"
              (should= 906609 (euler-4))

              )

          (it "can identify palindrome"
              (should= true (is-palindrome 9009))
              )
          (it "can identify non palindrome"
              (should= false (is-palindrome 100))
              )
          (it "can multiply two arbitrary sets"
              (should= '(1 2 3 4 5 6 7 8 9 2 4 6 8 10 12 14 16 18 3 6 9 12 15 18 21 24 27 4 8 12 16 20 24 28 32 36 5 10 15 20 25 30 35 40 45 6 12 18 24 30 36 42 48 54 7 14 21 28 35 42 49 56 63 8 16 24 32 40 48 56 64 72 9 18 27 36 45 54 63 72 81) (mult-all-with-lim 1 10))
              )
          )

(run-specs)
