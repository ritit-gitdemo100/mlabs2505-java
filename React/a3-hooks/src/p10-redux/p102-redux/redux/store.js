import { createStore } from "redux";
import notificationReducer from "./reducers"

const store = createStore(notificationReducer)

export default store;