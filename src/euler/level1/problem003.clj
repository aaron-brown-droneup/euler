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


(defn find-prime-factors [n, div, vec]

  (cond (= n 1) vec)

  (if (= 0 (rem n div))
    (do
      (conj vec div)
      (find-prime-factors (/ n div) div vec)
      )
    )
  (if (not (= 0 (rem n div)))
           (do
             (find-prime-factors n (get-next-prime div) vec)
             )
           )


  (cond
    (>= div n) vec
    )
  )



(defn euler-3 [n]
  (n)
  )