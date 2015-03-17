(defproject zk-web "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [noir "1.3.0-beta3"]
                 [com.netflix.curator/curator-framework "1.1.16"]
                 [com.netflix.curator/curator-test "1.1.16"]]
  :plugins [[lein-ring "0.9.3"]]
  :ring {:handler zk-web.server/handler}
  :main zk-web.server)
