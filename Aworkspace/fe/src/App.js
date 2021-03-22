import React from "react";
import { Route } from "react-router-dom";
import Home from "./cmm/container/Home";
import Counter from "./cmm/container/Counter";
import Login from "./sec/container/Login";
import Signup from "./uss/container/Signup";

const App = () => {
	return (
		<>
			<Route path="/" component={Home} exact />
			<Route path="/Counter" component={Counter} />
			<Route path="/Login" component={Login} />
			<Route path="/Signup" component={Signup} />
		</>
	);
};

export default App;
