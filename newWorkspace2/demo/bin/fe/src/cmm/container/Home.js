import React, { useState } from 'react'
import { Link } from 'react-router-dom'

const Home = () => {
    const formStyle = {
        width: "500px",
        margin: "0 auto",
        paddingTop: "100px",
        textAlign: "center"
    }
    return (
        <div style={formStyle}>
            <h1>Main</h1>
            <Link to={"Signup"}>회원가입</Link><br/>
            <Link to={"Login"}>로그인</Link><br/>
            <Link to={"Counter"}>카운터</Link><br/>
        </div>
    )
}

export default Home
