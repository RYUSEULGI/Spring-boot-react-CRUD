import React, { useState } from 'react'

const Counter = () => {
    const [count, setCount] = useState(0);
    const handlePlus = () => setCount(count + 1);
    const handleMinus = () => setCount(count - 1);

    // const [print, setPrint] = useState("");
    // const handleSubmit = () => {
    //     setPrint({print.id, print.pw});
    // }
    return(
        <> 
        <h1>{ count }</h1>
        <button onClick = { handlePlus }>plus</button>
        <button onClick = { handleMinus }>minus</button><br/>

        {/* <form>
        <input type="text" value={id}/>
        <input type="password" valus={pw}/>
        </form>
        <button onClick={ handleSubmit } type="submit">등록</button>
        <p>아이디 = {print.id} 비밀번호 = {print.pw} </p> */}
    </>
    )
}

export default Counter;