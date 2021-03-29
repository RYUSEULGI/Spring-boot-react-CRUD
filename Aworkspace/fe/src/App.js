import React from 'react';
import { Route } from 'react-router-dom';
import Home from './cmm/container/Home';
import Counter from './cmm/container/Counter';
import Login from './sec/container/Login';
import Signup from './uss/container/Signup';
import ItemList from './item/component/ItemLilst';
import ItemCreate from './item/component/ItemCreate';
import ItemRead from './item/component/ItemRead';
import ItemUpdate from './item/component/ItemUpdate';

const App = () => {
    return (
        <>
            <Route path="/" component={Home} exact />
            <Route path="/Counter" component={Counter} />
            <Route path="/Login" component={Login} />
            <Route path="/Signup" component={Signup} />
            <Route path="/items/list" component={ItemList} />
            <Route path="/items/item-number/:id" component={ItemRead} />
            <Route path="/items/item-number/:id/update" component={ItemUpdate} />
            <Route path="/items/create" component={ItemCreate} />
        </>
    );
};

export default App;
