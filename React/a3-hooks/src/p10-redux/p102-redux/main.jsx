import { Provider } from "react-redux";
import P102ReduxApp from "./app";
import store from "./redux/store";

export default function P102Redux() {
    return (
        <Provider store={store} >
            <P102ReduxApp />
        </Provider>

    )
}