package org.bboards.domains

class Position {

    String lat

    String lng

    Integer zoom

    static mapWith = "mongo"

    static constraints = {
        lat nullable: true
        lng nullable: true
        zoom nullable: true, inList: (5..21).toList()
    }
}
