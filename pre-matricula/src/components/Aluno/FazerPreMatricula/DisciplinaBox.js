import React from 'react';
import {Grid, Button} from 'semantic-ui-react';

import '../Aluno.css';
var bgColors = { "Default": "#81b71a",
                    "Blue": "#00B1E1",
                    "Cyan": "#37BC9B",
                    "Green": "#8CC152",
                    "Red": "#E9573F",
                    "Yellow": "#F6BB42",
};
export default class DisciplinaBox extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      selected: false
    }
    this.handleClick = this.handleClick.bind(this);
  }
  handleClick(e){
    e.preventDefault();
    this.setState({selected: !this.state.selected})
  }

  render() {

    return(
      <Grid.Row>
        <div className="boxDisciplina" onClick={(e) => {this.handleClick(e); this.props.handleSelect(e, this.props.cIndex, this.props.lIndex)}} style={{backgroundColor: `${this.state.selected ? "#E9573F" : "#00B1E1"}`}}>
        <div className="content">{this.props.name}
        </div></div>
      </Grid.Row>
    )
  }
}
