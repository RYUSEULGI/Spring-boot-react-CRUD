import React from "react";
import { Route } from "react-router-dom";
import Home from "./cmm/container/Home";
import Counter from "./cmm/container/Counter";
import Login from "./sec/container/Login";
import Signup from "./uss/container/Signup";
import ItemList from "./item/container/ItemLilst";
import ItemCreate from "./item/container/ItemCreate";
import ItemRead from "./item/container/ItemRead";

const App = () => {
    return (
        <>
            <Route path="/" component={Home} exact />
            <Route path="/Counter" component={Counter} />
            <Route path="/Login" component={Login} />
            <Route path="/Signup" component={Signup} />
            <Route path="/items/list" component={ItemList} />
            <Route path="/items/item-number/:id" component={ItemRead} />
            <Route path="/items/create" component={ItemCreate} />
        </>
    );
};

export default App;
