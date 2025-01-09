(ns euler.level1.problem002)

(defn fibonacci-up-to [max-value]
  (letfn [(fib-seq [a b]
            (if (> a max-value)
              '()
              (cons a (fib-seq b (+ a b)))))]
    (fib-seq 0 1)))

(defn fibonacci-even-up-to [max-value]
  (filter (fn [val] (not (odd? val))) (fibonacci-up-to max-value))
  )

(defn euler-2 [n]
  (apply + (fibonacci-even-up-to n))
  )

