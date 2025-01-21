(ns euler.level1.problem002)


(defn fib-seq [a b max-value]
  (if (> a max-value)
    '()
    (cons a (fib-seq b (+ a b) max-value))))

(defn fibonacci-even-up-to [max-value]
  (filter even? (fib-seq 0 1 max-value))
  )

(defn euler-2 [n]
  (apply + (fibonacci-even-up-to n))
  )

