import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-card-games',
  templateUrl: './card-games.component.html',
  styleUrls: ['./card-games.component.css']
})
export class CardGamesComponent implements OnInit {

  @Input()
  image:string = ""
  @Input()
  labelPS4:string | undefined
  @Input()
  labelPS5:string | undefined
  @Input()
  productType:string = ""
  @Input()
  gameTitle:string = ""
  @Input()
  gameEdition:string = ""
  @Input()
  priceOff:string = ""
  @Input()
  priceDescount:string = ""
  @Input()
  price:string = ""

  constructor() { }

  ngOnInit(): void {
  }

}
