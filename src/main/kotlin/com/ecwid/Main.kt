package com.ecwid

import jakarta.persistence.criteria.Expression
import org.hibernate.query.criteria.HibernateCriteriaBuilder
import org.hibernate.query.criteria.JpaFunction

fun HibernateCriteriaBuilder.someFunction(column: Expression<*>, data: Array<*>): JpaFunction<Boolean>? {
    return function("some_function", Boolean::class.java, column, literal(data))
}
