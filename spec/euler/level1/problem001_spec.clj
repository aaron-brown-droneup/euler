(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  ;; (it "finds multiples of 3 and 5")

  (it "Solves #1"
    (should= 0 (euler-1 0))
    (should= 0 (euler-1 1))
    (should= 0 (euler-1 2))
    (should= 0 (euler-1 3))
    (should= 3 (euler-1 4))
    (should= 3 (euler-1 5))
    (should= 8 (euler-1 6))
    (should= 23 (euler-1 10))
	  (should= 233168 (euler-1 1000)))
  )

(run-specs)
