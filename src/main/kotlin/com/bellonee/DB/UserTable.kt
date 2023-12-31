package com.bellonee.DB

import org.jetbrains.exposed.sql.Table
import java.time.LocalDateTime
import org.jetbrains.exposed.sql.javatime.datetime

object UserTable: Table("users") {
    val id = integer("id").autoIncrement()
    val fullName = varchar("full_name", 256)
    val avatar = text("avatar")
    val email = varchar("email", 256)
    val password = text("password")
    val createAt = datetime("create_at").clientDefault { LocalDateTime.now() }
    override val primaryKey = PrimaryKey(id)
}