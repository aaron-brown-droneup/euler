(ns euler.level1.problem003)





(defn is-prime [n]
  (empty? (filter #(= 0 %) (
                             for [x (range 2 (- n 1))]
                             (rem n x)
                             )))
  )


(defn get-next-prime [n]

  (cond
    (is-prime (inc n)) (inc n)
    :else
    (get-next-prime (inc n))
    )

  )

(defn get-prime-factors [n div]
  (cond
    (>= div n) [n]
    (= 0 (rem n div)) (cons div (get-prime-factors (/ n div) div))
    :else
    (get-prime-factors n (get-next-prime div))
    )
  )

(defn euler-3 [n]
  (apply max (get-prime-factors n 2))
  )



