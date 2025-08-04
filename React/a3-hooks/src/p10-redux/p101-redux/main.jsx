import { Provider } from "react-redux";
import store from "./redux/store";
import P101ReduxApp from "./app";
import P101ReduxApp2 from "./app2";

export default function P101Redux() {
    return (
        <Provider store={store} >
            <P101ReduxApp />
            <P101ReduxApp2 />
        </Provider>

    )
}