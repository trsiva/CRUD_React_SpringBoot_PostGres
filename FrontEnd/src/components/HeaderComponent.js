import React, { Component } from 'react'

class HeaderComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <div>
                <header>
                    <nav className="navbar-expand navbar-expand-lg navbar-dark bg-dark">
                    <div><a href="https://github.com/trsiva/crio.do" className="navbar-brand">Siva's  Management App</a></div>
                    </nav>
                </header>
            </div>
        )
    }
}

export default HeaderComponent
