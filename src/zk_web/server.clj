(ns zk-web.server
  (:require [noir.server :as server]
            [zk-web.conf :as conf]
            [zk-web.pages]
            )
  (:gen-class))

(server/load-views-ns 'zk-web.pages)

(def handler
  (do
    (println "hello")
    (server/gen-handler {:mode :dev
                         :ns   'zk-web}
                        ;:base-url "/zk-web"
                        ))
  )


(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (:server-port (conf/load-conf))]
    (server/start port {:mode mode
                        :ns   'zk-web})))
